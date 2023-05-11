package com.ping.admin.api;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ping.admin.api.helper.PcvPojoConverter;
import com.ping.admin.api.helper.PojoConverterHelper;
import com.ping.admin.api.pcvmodel.Payload;
import com.ping.admin.api.pcvmodel.RootPcv;



@RestController
@Validated
@RequestMapping("/ping")
public class PingAdminApiPcvController {

	@PostMapping(path="/newpcvcreation",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public RootPcv newPcvCreation(@RequestBody Payload payload) throws Exception{
    	RootPcv rootPcv = PcvPojoConverter.createRootPcv(payload);
    	return rootPcv;
    }
}
