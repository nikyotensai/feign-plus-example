package com.github.nikyotensai.clients;


import com.github.nikyotensai.clients.fallback.CommonReturn;
import com.github.nikyotensai.feign.fallback.DynamicFallbackFactory;
import com.github.nikyotensai.feign.fallback.annotation.ExceptionHandle;
import com.github.nikyotensai.feign.fallback.configuration.FeignPlusFallbackConfiguration;
import com.github.nikyotensai.clients.fallback.Provider2Return;
import com.github.nikyotensai.entity.Result;
import org.springframework.cloud.openfeign.FeignPlusClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignPlusClient(value = "provider", configuration = FeignPlusFallbackConfiguration.class, fallbackFactory = DynamicFallbackFactory.class)
@CommonReturn
@ExceptionHandle
public interface ProviderPlusClient {

    @RequestMapping(value = "/test/getSth", method = RequestMethod.GET)
    Result<Object> getSth();

    @RequestMapping(value = "/test/postSth", method = RequestMethod.POST)
    @Provider2Return
    Result<Object> postSth();

}
