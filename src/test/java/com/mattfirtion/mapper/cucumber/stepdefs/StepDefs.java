package com.mattfirtion.mapper.cucumber.stepdefs;

import com.mattfirtion.mapper.MapperApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MapperApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
