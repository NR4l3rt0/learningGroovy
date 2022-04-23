#!/usr/bin/env groovy

def text = "some text to match"
// strict match
def m = text ==~ /some text to match/                                           

assert m instanceof Boolean
println m

if (!m) {                                                         
    throw new RuntimeException("Should not reach that point!")
}
