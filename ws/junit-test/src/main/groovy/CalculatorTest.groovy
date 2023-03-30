import org.junit.Assert
import org.junit.Test
import static org.junit.Assert.*

class CalculatorTest {

    @Test
    void 'addition should work'(){
        def calc= new Calculator()
        def res=calc.add(100,200)
        assertEquals(300,res)
    }





}
