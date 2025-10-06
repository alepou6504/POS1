

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CustomerTest
{
    @Test
    public void testCustomerHatGeld()
    {
        Customer customer= new Customer ("Max", "Mustermann",1000);
        assertEquals("Max", customer.getVorname());
        assertEquals("Mustermann", customer.getNachname());
        assertEquals(1000, customer.getGeld());
    }
    
}