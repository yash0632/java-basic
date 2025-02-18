package main

import (
	"fmt"
	"math"
	"strconv"
	"sync"
	"sync/atomic"
	"time"
)


var MAX_INT = 100000000
var CONCURRENCY = 10
var totalPrimeNumbers int32 = 0

func checkPrime(x int){
	if x&1 == 0 {
		return
	}
	for i := 3;i <= int(math.Sqrt(float64(x))); i++ {
		if x%i == 0 {
			return
		}
	}
	atomic.AddInt32(&totalPrimeNumbers, 1)
}