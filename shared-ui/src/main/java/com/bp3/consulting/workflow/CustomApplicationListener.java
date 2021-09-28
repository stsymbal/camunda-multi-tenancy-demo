package com.bp3.consulting.workflow;

import org.camunda.bpm.BpmPlatform;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationListener {
    @EventListener
    public void onApplicationReadyEvent(final ApplicationReadyEvent event) {
        System.out.println("ProcessEngines=" + BpmPlatform.getProcessEngineService().getProcessEngineNames());
    }
}
