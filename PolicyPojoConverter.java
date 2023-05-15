package com.ping.admin.api.helper;

import com.ping.admin.api.policymodel.AuthenticationSelectorRef;
import com.ping.admin.api.policymodel.AuthenticationSource;
import com.ping.admin.api.policymodel.Child;
import com.ping.admin.api.policymodel.ChildContext;
import com.ping.admin.api.policymodel.DisplayName;
import com.ping.admin.api.policymodel.FsFriendlyId;
import com.ping.admin.api.policymodel.FsFriendlyName;
import com.ping.admin.api.policymodel.FsOrgFriendlyName;
import com.ping.admin.api.policymodel.FsScope;
import com.ping.admin.api.policymodel.GivenName;
import com.ping.admin.api.policymodel.IssuanceCriteria;
import com.ping.admin.api.policymodel.Mail;
import com.ping.admin.api.policymodel.PolicyPayload;
import com.ping.admin.api.policymodel.RiskLevel;
import com.ping.admin.api.policymodel.Root;
import com.ping.admin.api.policymodel.RootNode;
import com.ping.admin.api.policymodel.Sn;
import com.ping.admin.api.policymodel.Source;
import com.ping.admin.api.policymodel.SourceRef;
import com.ping.admin.api.policymodel.Subject;
import com.ping.admin.api.policymodel.Uid;
import com.ping.admin.api.policymodel.Username;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ping.admin.api.policymodel.Action;
import com.ping.admin.api.policymodel.ActionContext;
import com.ping.admin.api.policymodel.ActionMapping;
import com.ping.admin.api.policymodel.ActionType;
import com.ping.admin.api.policymodel.AttributeContractFulfillment;
import com.ping.admin.api.policymodel.AttributeFulfilment;
import com.ping.admin.api.policymodel.AttributeMapping;
import com.ping.admin.api.policymodel.AuthenticationApiApplicationRef;
import com.ping.admin.api.policymodel.AuthenticationPolicyContractRef;

public class PolicyPojoConverter {

	public static String url = "https://localhost:9999/pf-admin-api/v1/";
	
	@JsonProperty("action")
	public static ActionType actionType;
	
	@JsonProperty("action")
	public static ActionContext actionContext;
	
	@JsonProperty("action")
	public static ActionContext actionContext1;
	
	public static Root createRootPolicy(PolicyPayload payload) {
		
		AuthenticationSelectorRef authenticationSelectorRef = new AuthenticationSelectorRef(payload.getSelectorId(),url+"authenticationSelectors/"+payload.getSelectorId());
		actionType = new ActionType("AUTHN_SELECTOR",authenticationSelectorRef);
		
		actionContext = new ActionContext("CONTINUE","No");
		Action action = new Action("AUTHN_SOURCE","Yes",new AuthenticationSource("IDP_ADAPTER",new SourceRef(payload.getAdapterid(), url+"idp/adapters/"+payload.getAdapterid())));
		
		ArrayList<Object> children = new ArrayList<Object>();
		children.add(action);
		
		AuthenticationPolicyContractRef authenticationPolicyContractRef = new AuthenticationPolicyContractRef(payload.getPolicyContractId(),url+"authenticationPolicyContracts/"+payload.getPolicyContractId());
		//Uid uid = new Uid(new Source("ADAPTER",payload.getAdapterid()),"uid");
		//ArrayList<Object> contractFulfilment = new ArrayList<Object>();
		//contractFulfilment.add(new AttributeFulfilment(new Source("ADAPTER",payload.getAdapterid()),"uid"));
		AttributeContractFulfillment attributeContractFulfillment = new AttributeContractFulfillment();
		attributeContractFulfillment.setUid(new Uid(new Source("ADAPTER",payload.getAdapterid()),"uid"));
		attributeContractFulfillment.setMail(new Mail(new Source("ADAPTER",payload.getAdapterid()),"mail"));
		attributeContractFulfillment.setDisplayName(new DisplayName(new Source("ADAPTER",payload.getAdapterid()),"displayName"));
		attributeContractFulfillment.setSubject(new Subject(new Source("ADAPTER",payload.getAdapterid()),"subject"));
		
		attributeContractFulfillment.setFsOrgFriendlyName(new FsOrgFriendlyName(new Source("ADAPTER",payload.getAdapterid()),"fsOrgFriendlyName"));
		attributeContractFulfillment.setGivenName(new GivenName(new Source("ADAPTER",payload.getAdapterid()),"givenName"));
		attributeContractFulfillment.setSn(new Sn(new Source("ADAPTER",payload.getAdapterid()),"sn"));
		//attributeContractFulfillment.setRiskLevel(new RiskLevel(new Source("ADAPTER",payload.getAdapterid()),"subject"));
		attributeContractFulfillment.setFsFriendlyName(new FsFriendlyName(new Source("ADAPTER",payload.getAdapterid()),"fsFriendlyName"));
		attributeContractFulfillment.setFsScope(new FsScope(new Source("ADAPTER",payload.getAdapterid()),"fsScope"));
		attributeContractFulfillment.setFsFriendlyId(new FsFriendlyId(new Source("ADAPTER",payload.getAdapterid()),"fsFriendlyId"));
		attributeContractFulfillment.setUsername(new Username(new Source("ADAPTER",payload.getAdapterid()),"username"));
		
		//AttributeFulfilment attributeFulfilment = new AttributeFulfilment();
		IssuanceCriteria issuanceCriteria = new IssuanceCriteria(new ArrayList<Object>());
		AttributeMapping attributeMapping = new AttributeMapping(new ArrayList<Object>(),attributeContractFulfillment,issuanceCriteria);
		ActionMapping actionMapping = new ActionMapping("APC_MAPPING","Success",authenticationPolicyContractRef,attributeMapping);
		
		actionContext1 = new ActionContext("DONE","Fail");
		ChildContext childVal = new ChildContext(actionContext1);
		ArrayList<Object> children1 = new ArrayList<Object>();
		children1.add(childVal);
		children1.add(actionMapping);
		
		Child child1 = new Child(action,children1);
		ChildContext child = new ChildContext(actionContext);
		ArrayList<Object> childList1 = new ArrayList<Object>();
		childList1.add(child);
		childList1.add(child1);
		//childList1.add(childList);
		
		RootNode rootNode = new RootNode(actionType,childList1);
		
		Root root = new Root(rootNode,payload.getPolicyId(),payload.getPolicyName(),true,new AuthenticationApiApplicationRef(payload.getAuthAppAPIId(),url+"authenticationApi/applications/"+payload.getAuthAppAPIId()),false);
		return root;
	}
}
