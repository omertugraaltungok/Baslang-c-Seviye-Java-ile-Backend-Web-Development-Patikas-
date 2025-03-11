# Merge Sort Projesi

Author: Ömer Tuğra Altungök

Bu Dosya [Veri Yapıları Ve Algoritmarı](https://academy.patika.dev/courses/veri-yapilari-ve-algoritmalar) dersinin [Merge Sort Ödevini](https://academy.patika.dev/courses/veri-yapilari-ve-algoritmalar/merge-sort-proje) içeriyor.


***

***[16,21,11,8,12,22]***

1. Yukarıdaki dizinin Merge sort türüne göre aşamalarını yazınız.

- **Cevap**

       [16,21,11]                     [8,12,22]

     [16,21] [11]                    [8,12] [22]

    [16] [21] [11]                  [8] [12] [22]

    [16,21] [11]                    [8,12] [22]

    [11,16,21]                      [8,12,22]

-               [8,11,12,16,21,22]


***

2. Big-O gösterimini yazınız.

- **Cevap**

> O(nlogn)