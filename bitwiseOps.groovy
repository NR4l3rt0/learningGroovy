#!/usr/bin/env groovy

int a = 0b00101010
assert a == 42
int b = 0b00001000
assert b == 8
assert (a & a) == a                     
assert (a & b) == b                     
assert (a | a) == a                     
assert (a | b) == a                     

int mask = 0b11111111                   
println Integer.toBinaryString(((a ^ a) & mask)) // == 0b00000000   
println Integer.toBinaryString(((a ^ a) & mask)) // == 0b00000000   
println Integer.toBinaryString(((a ^ b) & mask)) // == 0b00100010   
println Integer.toBinaryString(((~a) & mask))    // == 0b11010101  
