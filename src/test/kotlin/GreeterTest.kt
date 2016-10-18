import org.junit.Assert
import org.junit.Test

class GreeterTest {
    @Test
    fun greetByName() {
        val greeter = Greeter()

        val greeting: String = greeter.greet("John")

        Assert.assertEquals("Hello, John!", greeting)
    }
}
