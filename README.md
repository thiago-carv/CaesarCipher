# CAESAR CIPHER

A [Caesar Cipher](https://en.wikipedia.org/wiki/Caesar_cipher) is one of the simplest and most widely known encryption techniques.

It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet.

The transformation can be represented by aligning two alphabets; the cipher alphabet is the plain alphabet rotated left or right by some number of positions. For example, this Caesar Cipher uses a left rotation of three places (equivalent to a right shift of 23). We can see that _D_ is replaced by _A_, _E_ would become _B_, and so on:
```
Plain:    ABCDEFGHIJKLMNOPQRSTUVWXYZ
Cipher:   XYZABCDEFGHIJKLMNOPQRSTUVW
```

***

#### May 6th, 2020
Current program has a hardcoded offset (rotation) of 12.   
Therefore, the cipher alphabet is: **MNOPQRSTUVWXYZABCDEFGHIJKL**

The message is hardcoded to be "how are you doing today".   
Uppercase and special character handling has not been implemented.
