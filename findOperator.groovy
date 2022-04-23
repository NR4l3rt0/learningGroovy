#!/usr/bin/env groovy

import java.util.regex.Matcher

def text = "some text to match"
def m = text =~ /match/                                           

assert m instanceof Matcher                                       
println m

if (!m) {                                                         
    throw new RuntimeException("Oops, text not found!")
}
