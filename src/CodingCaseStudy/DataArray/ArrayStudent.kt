package CodingCaseStudy.DataArray

import java.util.*
import kotlin.collections.ArrayList
import kotlin.system.exitProcess

fun main() {
    var id = 0
    val input = Scanner(System.`in`)
    val idStudent = ArrayList<Int>()
    val nameStudent = ArrayList<String>()
    val nimStudent = ArrayList<String>()
    val jurusanStudent = ArrayList<String>()
    val angkatanStudent = ArrayList<Int>()

    println("----- DATA MAHASISWA -----")
    var menu = 0
    while (menu != 4) {
        print("Pilih Menu: \n1. Tambah\n2. Tampil\n3. Hapus\n4. Exit\nPilih: ")
        menu = input.nextInt()
        when(menu) {
            1 -> {
                print("Masukan nama     : ")
                val name = readLine()
                print("Masukan nim      : ")
                val nim = input.next()
                print("Masukan jurusan  : ")
                val jurusan = readLine()
                print("Masukan angkatan : ")
                val angkatan = input.nextInt()

                idStudent.add(++id)
                name?.let { nameStudent.add(it) }
                nimStudent.add(nim)
                jurusan?.let { jurusanStudent.add(it) }
                angkatanStudent.add(angkatan)

                println("Data berhasil diinputkan\n")
            }
            2 -> {
                println("---Data Mahasiswa---")
                for (x in 0 until id) {
                    val id = idStudent[x]
                    val name = nameStudent[x]
                    val nim = nimStudent[x]
                    val jurusan = jurusanStudent[x]
                    val angkatan = angkatanStudent[x]
                    println("$id $name\t$nim\t$jurusan\t$angkatan")
                }
                println()
            }
            3 -> {
                idStudent.removeAt(id-1)
                nameStudent.removeAt(id-1)
                nimStudent.removeAt(id-1)
                jurusanStudent.removeAt(id-1)
                angkatanStudent.removeAt(id-1)
                println("Data berhasil di hapus")
                id--
            }
            4 -> {
                println("Anda sudah keluar dari sistem ini")
                exitProcess(1)
            }
        }
    }
}