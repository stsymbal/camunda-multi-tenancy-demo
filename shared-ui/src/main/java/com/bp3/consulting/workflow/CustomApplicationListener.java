package com.bp3.consulting.workflow;

import org.camunda.bpm.BpmPlatform;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        System.out.println("ProcessEngines=" + BpmPlatform.getProcessEngineService().getProcessEngineNames());
    }
}
