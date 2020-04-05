
package com.com470.p4app.service;

import com.com470.p4app.model.MinimoMaximo;
import java.util.List;
import java.util.Arrays;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BuscarMinimoMaximoTest {
    
    public BuscarMinimoMaximoTest() {
    }
    
    private BuscarMinimoMaximo utils=new BuscarMinimoMaximo();
    
    @Before
    public void setUp() {
    }

    @Test
    public void testBuscarMinimoMaximo() {
        List<Integer> lista=Arrays.asList(2,2,3,4,5,6,7,8,9,14,1,44,2);
        MinimoMaximo resultado=utils.buscarMinimoMaximo(lista);
        MinimoMaximo esperado=new MinimoMaximo(1,44);
        test(esperado,lista);
    }
    @Test
    public void testBuscarMinimoMaximo2() {
        List<Integer> lista=Arrays.asList(2,2,3,4,5,6,7,8,9,14,222,-44,2);
        MinimoMaximo resultado=utils.buscarMinimoMaximo(lista);
        MinimoMaximo esperado=new MinimoMaximo(-44,222);
        test(esperado,lista);
       
    }
    
    @Test
    public void testBuscarMinimoMaximo3() {
        List<Integer> lista=Arrays.asList(-344,-2,-44,-5,-1);
        MinimoMaximo resultado=utils.buscarMinimoMaximo(lista);
        MinimoMaximo esperado=new MinimoMaximo(-344,-1);
        test(esperado,lista);
        test2(esperado,lista);
    }
    
    
    private void test(MinimoMaximo esperado,List<Integer>lista){
        assertEquals(esperado,utils.buscarMinimoMaximo(lista));
        
    }
    
    private void test2(MinimoMaximo esperado,List<Integer>lista){
        assertThat(utils.buscarMinimoMaximo(lista),Matchers.equalTo(esperado));
        assertThat(utils.buscarMinimoMaximo(lista),Matchers.is(esperado));
        assertThat(utils.buscarMinimoMaximo(lista),Matchers.not(new MinimoMaximo(-344,2)));
    }
}
