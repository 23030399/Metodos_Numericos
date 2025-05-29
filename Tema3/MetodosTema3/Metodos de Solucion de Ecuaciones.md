# Tema 3 - Métodos de Solución de Sistemas de Ecuaciones Lineales

## Índice
- [Introducción](#introducción)
- [Método de Gauss-Jordan](#método-de-gauss-jordan)
- [Método de Gauss](#método-de-gauss)
- [Método de Gauss-Seidel](#método-de-gauss-seidel)
- [Método de Jacobi](#método-de-jacobi)
- [Recursos Adicionales](#recursos-adicionales)

## Introducción

Los sistemas de ecuaciones lineales son fundamentales en matemáticas aplicadas, ingeniería y ciencias computacionales. Un sistema de ecuaciones lineales se puede expresar como \( Ax = b \), donde \( A \) es una matriz de coeficientes, \( x \) es el vector de incógnitas y \( b \) es el vector de términos independientes. Resolver estos sistemas implica encontrar \( x \) que satisfaga la ecuación. Existen métodos directos, que obtienen la solución exacta en un número finito de pasos, y métodos iterativos, que generan aproximaciones que convergen hacia la solución. A continuación, se describen cuatro métodos comunes: Gauss-Jordan, Gauss, Gauss-Seidel y Jacobi.

## Método de Gauss-Jordan

El método de **Gauss-Jordan** es un método directo que resuelve sistemas de ecuaciones lineales transformando la matriz aumentada \([A|b]\) en una matriz identidad mediante operaciones elementales (intercambio de filas, multiplicación de filas por una constante y suma/resta de filas). La solución se obtiene directamente de la matriz resultante.

**Fórmula básica**:
- Para un sistema \( Ax = b \), se transforma \([A|b]\) en \([I|x]\), donde \( I \) es la matriz identidad y \( x \) es la solución.
- Operaciones: 
  - Escalonamiento para obtener ceros debajo y encima de la diagonal.
  - Normalización para obtener 1 en la diagonal.

**Ejemplo**:
\[
\begin{bmatrix}
2 & 1 & | & 5 \\
1 & 3 & | & 8
\end{bmatrix}
\to
\begin{bmatrix}
1 & 0 & | & x_1 \\
0 & 1 & | & x_2
\end{bmatrix}
\]

## Método de Gauss

El método de **Gauss** (o eliminación gaussiana) es un método directo que transforma la matriz aumentada \([A|b]\) en una matriz triangular superior. Luego, se resuelve el sistema mediante sustitución hacia atrás.

**Fórmula básica**:
- Transformar \( A \) en una matriz triangular superior \( U \) mediante operaciones elementales:
\[
U x = c
\]
- Resolución por sustitución hacia atrás:
\[
x_i = \frac{c_i - \sum_{j=i+1}^{n} u_{ij} x_j}{u_{ii}}, \quad i = n, n-1, \dots, 1
\]

**Ejemplo**:
\[
\begin{bmatrix}
2 & 1 & | & 5 \\
1 & 3 & | & 8
\end{bmatrix}
\to
\begin{bmatrix}
2 & 1 & | & 5 \\
0 & 2.5 & | & 5.5
\end{bmatrix}
\]

## Método de Gauss-Seidel

El método de **Gauss-Seidel** es un método iterativo que resuelve sistemas de ecuaciones lineales iterando sobre una aproximación inicial. En cada iteración, usa los valores más recientes de las variables para calcular la siguiente.

**Fórmula básica**:
- Para el sistema \( Ax = b \), la iteración se define como:
\[
x_i^{(k+1)} = \frac{b_i - \sum_{j=1}^{i-1} a_{ij} x_j^{(k+1)} - \sum_{j=i+1}^{n} a_{ij} x_j^{(k)}}{a_{ii}}, \quad i = 1, 2, \dots, n
\]
- Donde \( x^{(k)} \) es el vector en la iteración \( k \), y se actualizan las variables en orden.

**Condición**: El método converge si la matriz \( A \) es diagonalmente dominante o definida positiva.

## Método de Jacobi

El método de **Jacobi** es otro método iterativo donde todas las variables se actualizan simultáneamente en cada iteración, usando los valores de la iteración anterior.

**Fórmula básica**:
- Para el sistema \( Ax = b \), la iteración se define como:
\[
x_i^{(k+1)} = \frac{b_i - \sum_{j \neq i} a_{ij} x_j^{(k)}}{a_{ii}}, \quad i = 1, 2, \dots, n
\]
- Donde \( x^{(k)} \) es el vector en la iteración \( k \), y todas las \( x_i^{(k+1)} \) se calculan antes de actualizar.

**Condición**: Similar a Gauss-Seidel, requiere que \( A \) sea diagonalmente dominante para garantizar convergencia.

## Recursos Adicionales

- [Numerical Methods for Linear Systems](https://en.wikipedia.org/wiki/System_of_linear_equations#Numerical_methods) - Introducción a métodos numéricos para sistemas lineales.
- [Numerical Recipes](http://numerical.recipes/) - Libro con capítulos sobre métodos directos e iterativos.
- [MIT OpenCourseWare: Linear Algebra](https://ocw.mit.edu/courses/mathematics/18-06-linear-algebra-spring-2010/) - Curso con material sobre sistemas de ecuaciones lineales.
