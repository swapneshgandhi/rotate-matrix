Rotate matrix by 90 degress.

1. Transpose the matrix.
2. Reverse elements in a row.

```
Original Matrix
[ 1  2  3]
[ 2  4  5]
[ 4  4  5]
```

```
Transpose Matrix
[ 1  2  4]
[ 2  4  4]
[ 3  5  5]
```

```
After reversing Matrix == after 90 rotation.
[ 4  2  1]
[ 4  4  2]
[ 5  5  3]
```

How to run

`mvn clean package`

`java -cp ./target/rorate-matrix-1.0-SNAPSHOT.jar com.matrix.RunRotateMatrix`