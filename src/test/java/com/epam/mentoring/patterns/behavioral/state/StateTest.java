package com.epam.mentoring.patterns.behavioral.state;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StateTest {
    Context context = new Context();
    
    @Test
    public void testDoAction_startState(){
    	State state = new StartState();
    	
    	state.doAction(context);
        
        assertThat(context.getState(), instanceOf(StartState.class));
        assertEquals("Start State", context.getState().toString());
    }
    
    @Test
    public void testDoAction_endState(){
    	State state = new StopState();
    	
    	state.doAction(context);
        
        assertThat(context.getState(), instanceOf(StopState.class));
        assertEquals("Stop State", context.getState().toString());
    }
}
