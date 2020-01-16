package task1

class Task1_2 {
    static def getUniqueNumbersAmount(List arr) {
        arr.unique().size()
    }

    static def getFindMinAndMax(List arr) {
        return [arr.min(), arr.max()]
    }

    static increaseNumbers(List arr){
        def increase = {num ->
            num < 0 ? num * 3 : num * 2
        }
        return arr.collect(increase)
    }

    static getCommonNumbers(List arr1, List arr2){
        arr1.intersect(arr2).unique()
    }
}
