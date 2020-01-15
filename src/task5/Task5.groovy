package task5

Integer count = 10
Integer num = 1
for (Integer i = 0; i < count; i++) {
    Thread.start {
        num++
        sleep(100)
    }
}
println(num)


