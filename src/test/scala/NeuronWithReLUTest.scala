import com.reactivedu.nnet.components.NeuronWithReLU
import org.scalatest.*
import flatspec.*
import matchers.*
import breeze.linalg.DenseVector

class NeuronWithReLUTest extends AnyFlatSpec with should.Matchers {
  "activate" should "return vector with a zero value substituted for a negative value in an input vector" in {
    val neuron = NeuronWithReLU
    val inputVector = DenseVector(-.1, .5, -.1)
    val expectedVector = DenseVector(0, .5, 0)
    val outputVector = neuron activate inputVector
    outputVector should be(expectedVector)
  }
}
