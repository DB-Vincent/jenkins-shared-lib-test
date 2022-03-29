#!/usr/bin/env groovy
package be.vincentdeborger

class SampleClass {
    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }
}