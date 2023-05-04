package com.harikishore.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class TopicMergeControllerTest {

    // create a Mock object of TopicMergeController class
    @Mock
    TopicMergeController topicMergeController = Mockito.mock(TopicMergeController.class);

    @Test
    public void getDataTest() {
        Mockito.when(topicMergeController.getData()).thenReturn("[{\"name\":\"hari\",\"lastaudit\":null,\"id\":1},{\"name\":\"kishore\",\"lastaudit\":null,\"id\":2}]");
        Assert.assertEquals(topicMergeController.getData(), "[{\"name\":\"hari\",\"lastaudit\":null,\"id\":1},{\"name\":\"kishore\",\"lastaudit\":null,\"id\":2}]");
    }

    // write a test for postData method of TopicMergeController class using Mock objects
    @Test
    public void postDataTest() {
        Mockito.when(topicMergeController.postData(1,"hari")).thenReturn("Data Inserted");
        Assert.assertEquals(topicMergeController.postData(1,"hari"), "Data Inserted");
    }


}
