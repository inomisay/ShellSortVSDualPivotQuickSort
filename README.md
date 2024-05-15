# ShellSortVSDualPivotQuickSort

## Description

This project implements Shellsort and DualPivotQuickSort algorithms in Java. It aims to analyze their runtime performance under various input scenarios, comparing their efficiency and scalability.

## Implementation

The project includes a `SortingClass` containing methods `dualPivotQuickSort` and `shellSort` to implement the respective sorting algorithms.

### DualPivotQuickSort
This method implements a modified version of quicksort with two pivots, dividing the array into three parts based on the left and right pivots.

### ShellSort
This method implements an improved version of the insertion sort algorithm called Shellsort. It breaks the array into subarrays using a gap sequence and sorts them using insertion sort.

## Runtime Analysis

The project compares the running times (in milliseconds) of both algorithms for different input scenarios: equal integers, random integers, increasing integers, and decreasing integers.

## Scientific Report

The project includes a scientific report analyzing the obtained results, establishing a connection between the asymptotic running time complexity and the empirical results. Additionally, it determines the appropriate sorting algorithm for two scenarios: student placement based on exam grades and dictionary translation.

### Scenario A

For placing students at universities based on exam grades, the project analyzes which sorting algorithm would perform the task faster.

### Scenario B

For translating a Turkish-English dictionary into an English-Turkish dictionary, the project determines the sorting algorithm that would be more efficient.

