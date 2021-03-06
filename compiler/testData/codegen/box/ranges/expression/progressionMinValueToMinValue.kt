// TODO: muted automatically, investigate should it be ran for JS_IR or not
// IGNORE_BACKEND: JS_IR

// TODO: muted automatically, investigate should it be ran for JVM_IR or not
// IGNORE_BACKEND: JVM_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


const val MinI = Int.MIN_VALUE
const val MinB = Byte.MIN_VALUE
const val MinS = Short.MIN_VALUE
const val MinL = Long.MIN_VALUE
const val MinC = Char.MIN_VALUE
const val MinUI = UInt.MIN_VALUE
const val MinUB = UByte.MIN_VALUE
const val MinUS = UShort.MIN_VALUE
const val MinUL = ULong.MIN_VALUE

fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = MinI..MinI step 1
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(MinI)) {
        return "Wrong elements for MinI..MinI step 1: $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = MinB..MinB step 1
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(MinB.toInt())) {
        return "Wrong elements for MinB..MinB step 1: $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = MinS..MinS step 1
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(MinS.toInt())) {
        return "Wrong elements for MinS..MinS step 1: $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = MinL..MinL step 1
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(MinL)) {
        return "Wrong elements for MinL..MinL step 1: $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = MinC..MinC step 1
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>(MinC)) {
        return "Wrong elements for MinC..MinC step 1: $list5"
    }

    val list6 = ArrayList<UInt>()
    val range6 = MinUI..MinUI step 1
    for (i in range6) {
        list6.add(i)
        if (list6.size > 23) break
    }
    if (list6 != listOf<UInt>(MinUI)) {
        return "Wrong elements for MinUI..MinUI step 1: $list6"
    }

    val list7 = ArrayList<UInt>()
    val range7 = MinUB..MinUB step 1
    for (i in range7) {
        list7.add(i)
        if (list7.size > 23) break
    }
    if (list7 != listOf<UInt>(MinUB.toUInt())) {
        return "Wrong elements for MinUB..MinUB step 1: $list7"
    }

    val list8 = ArrayList<UInt>()
    val range8 = MinUS..MinUS step 1
    for (i in range8) {
        list8.add(i)
        if (list8.size > 23) break
    }
    if (list8 != listOf<UInt>(MinUS.toUInt())) {
        return "Wrong elements for MinUS..MinUS step 1: $list8"
    }

    val list9 = ArrayList<ULong>()
    val range9 = MinUL..MinUL step 1
    for (i in range9) {
        list9.add(i)
        if (list9.size > 23) break
    }
    if (list9 != listOf<ULong>(MinUL)) {
        return "Wrong elements for MinUL..MinUL step 1: $list9"
    }

    return "OK"
}
