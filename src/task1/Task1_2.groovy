package task1

class Task1_2 {
    static def getUniqueNumbersAmount(List arr) {
        arr.unique().size()
    }

    static def getFindMinAndMax(List arr) {
        def res = [arr[0], arr[0]]
        arr.each {
            res[0] = res[0] < it ? res[0] : it
            res[1] = res[1] > it ? res[1] : it
        }
        return res
    }

    static increaseNumbers(List arr){
        def increase = {num ->
            num < 0 ? num * 3 : num * 2
        }
        return arr.collect(increase)
    }

    static getCommonNumbers(List arr1, List arr2){
        arr1.findAll {
            arr2.contains(it)
        }.unique()
    }
}
