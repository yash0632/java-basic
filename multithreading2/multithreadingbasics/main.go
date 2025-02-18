package main 

import (
	"fmt"
	"time"

)

func someTask(id int,data chan int){
	for taskId := range data {
		time.Sleep(2 * time.Second)
		fmt.Printf("Worker: %d execeuted Task %d\n",id ,taskId)
	}
}

func main(){
	channel := make(chan int)

	start := time.Now()

	for i:=0;i < 10000;i++{
		go someTask(i,channel)
	}

	for i := 0;i < 1000000;i++{
		channel <- i
	}

	fmt.Printf("Took %v\n",time.Since(start))
}