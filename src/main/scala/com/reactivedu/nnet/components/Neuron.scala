package com.reactivedu.nnet.components

import breeze.linalg.DenseVector
import breeze.linalg.max

abstract class Neuron

trait Activation {
  def activate(input: DenseVector[Double]): DenseVector[Double]

  def output(input: DenseVector[Double]): DenseVector[Double]
}

object NeuronWithReLU extends Neuron with Activation {
  override def activate(input: DenseVector[Double]): DenseVector[Double] = max(input, .0)

  override def output(input: DenseVector[Double]): DenseVector[Double] = ???
}