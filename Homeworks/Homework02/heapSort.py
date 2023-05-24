# Пирамидальная сортировка (бинарной кучей)
# 1. Преобразовать массив в сортирующее дерево max-heap для сортировки min->max
# 2. Циклично: перемещать корневой элемент в конец кучи и переформировывать кучу с новым корнем

import random

def heaping(array, unsortedSize, parentIndex):
    # определяем индексы детей для родителя
    leftChild = parentIndex * 2 + 1 
    rightChild = parentIndex * 2 + 2

    # ищем max из тройки родитель + 2 ребенка
    largestElement = parentIndex
    if leftChild < unsortedSize and array[leftChild] > array[largestElement]:
        largestElement = leftChild
    if rightChild < unsortedSize and array[rightChild] > array[largestElement]:
        largestElement = rightChild

    # если кто-то из детей больше родителя - меняем их местами 
    # и переформировываем поддерево затронутого ребенка
    if largestElement != parentIndex:
        array[largestElement], array[parentIndex] = array[parentIndex], array[largestElement]
        heaping(array, unsortedSize, largestElement)
    
def heapSorting(array):
    size = len(array)

    # формируем базовый max-heap
    for i in range((size // 2 - 1), -1, -1):
        heaping(array,size,i)

    # для каждого элемента max-heap извлекаем корневой элемент
    # помещаем на его место последний элемент кучи
    # и переформировываем max-heap для уменьшенной на 1 кучи
    for i in range(size-1, 0, -1):
        array[0], array[i] = array[i], array[0]
        heaping(array, i, 0)

min = 0
max = 10
size = 20
testArray = [random.randrange(min, max+1) for i in range(size)]

print(testArray)
heapSorting(testArray)
print(testArray)