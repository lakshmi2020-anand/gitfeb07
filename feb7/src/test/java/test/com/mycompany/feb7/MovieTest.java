/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.mycompany.feb7;

import com.mycompany.feb7.Movie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author toola
 */
public class MovieTest {
     Movie movie;

     public MovieTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
       movie = new Movie();     
    }
    

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testMovie() {
  
           movie.setID("A123");
           movie.setNAME("Iron Man");
                    
           assertEquals("Iron Man", movie.getNAME());
           assertEquals("A123", movie.getID());
}
}
