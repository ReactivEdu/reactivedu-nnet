package com.reactivedu.nnet.components

import breeze.linalg.DenseVector
import breeze.linalg.max

trait Activation {
  def activate(input: DenseVector[Double]): DenseVector[Double]
}

object ReLU extends Activation {
  def activate(input: DenseVector[Double]): DenseVector[Double] = max(input, .0)
}