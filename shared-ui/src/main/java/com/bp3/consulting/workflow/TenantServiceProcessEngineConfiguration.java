package com.bp3.consulting.workflow;

import javax.sql.DataSource;

import org.camunda.bpm.engine.impl.cfg.StandaloneProcessEngineConfiguration;

public class TenantServiceProcessEngineConfiguration extends StandaloneProcessEngineConfiguration {
    @Override
    protected void initDataSource() {
        dataSource = SpringContext.getBean(DataSource.class);
        super.initDataSource();
    }
}
