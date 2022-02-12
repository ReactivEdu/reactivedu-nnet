import com.reactivedu.nnet.components.NeuronWithReLU
import org.scalatest.*
import flatspec.*
import matchers.*
import breeze.linalg.DenseVector

class ReLUActivationTest extends AnyFlatSpec with should.Matchers {
  "A ReLU function" should "return zeroed vector for a vector with negative values" in {
    val activation = NeuronWithReLU
    val inputVector = DenseVector(-.1, -.1, -.1)
    val expectedVector = DenseVector.zeros[Double](3)
    val outputVector = activation.activate(inputVector)
    outputVector should be(expectedVector)
  }
}
