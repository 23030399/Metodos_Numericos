
# Métodos para Encontrar Raíces de Ecuaciones No Lineales

## Índice
- [Introducción](#introducción)
- [Método de Bisección](#método-de-bisección)
- [Método de Punto Fijo](#método-de-punto-fijo)
- [Método de la Secante](#método-de-la-secante)
- [Método de la Regla Falsa](#método-de-la-regla-falsa)
- [Método de Newton-Raphson](#método-de-newton-raphson)
- [Recursos Adicionales](#recursos-adicionales)

## Introducción

Encontrar las raíces de una ecuación no lineal $f(x) = 0$ es un problema común en matemáticas aplicadas y ciencias computacionales. Una raíz es un valor $x$ que satisface la ecuación. Dado que muchas ecuaciones no tienen soluciones analíticas exactas, los métodos numéricos son esenciales para obtener aproximaciones precisas. A continuación, se describen cinco métodos comunes: Bisección, Punto Fijo, Secante, Regla Falsa y Newton-Raphson, con sus algoritmos y fórmulas.

## Método de Bisección

**Descripción**: El método de Bisección es un método iterativo que encuentra una raíz en un intervalo $[a, b]$ donde $f(a) \cdot f(b) < 0$ (es decir, la función cambia de signo). Divide el intervalo a la mitad en cada iteración y selecciona el subintervalo que contiene la raíz.

**Fórmula básica**:

```
c = (a + b)/2
```

- Si $f(c) = 0$ o $|b - a| < \text{tol}$, $c$ es la raíz.
- Si $f(a) \cdot f(c) < 0$, actualiza $b = c$; de lo contrario, $a = c$.

**Algoritmo**:
1. Definir intervalo $[a, b]$ donde $f(a) \cdot f(b) < 0$.
2. Calcular $c = (a + b)/2$.
3. Evaluar $f(c)$.
4. Si $|f(c)| < \text{tol}$ o $|b - a| < \text{tol}$, retornar $c$.
5. Si $f(a) \cdot f(c) < 0$, actualizar $b = c$; sino, $a = c$.
6. Repetir hasta convergencia o máximo de iteraciones.

## Método de Punto Fijo

**Descripción**: El método de Punto Fijo transforma la ecuación $f(x) = 0$ en $x = g(x)$, donde $x$ es un punto fijo de la función $g$. Itera desde una aproximación inicial hasta converger a la raíz.

**Fórmula básica**:

```
x_{n+1} = g(x_n)
```

- Converge si $|g'(x)| < 1$ cerca de la raíz.

**Algoritmo**:
1. Reescribir $f(x) = 0$ como $x = g(x)$.
2. Elegir una aproximación inicial $x_0$.
3. Calcular $x_{n+1} = g(x_n)$.
4. Si $|x_{n+1} - x_n| < \text{tol}$, retornar $x_{n+1}$.
5. Actualizar $x_n = x_{n+1}$ y repetir hasta convergencia.

## Método de la Secante

**Descripción**: El método de la Secante aproxima la raíz usando la pendiente de una recta secante entre dos puntos iniciales. No requiere la derivada de la función.

**Fórmula básica**:

```
x_{n+1} = x_n - f(x_n) * (x_n - x_{n-1}) / (f(x_n) - f(x_{n-1}))
```

**Algoritmo**:
1. Elegir dos aproximaciones iniciales $x_0$ y $x_1$.
2. Calcular $f(x_0)$ y $f(x_1)$.
3. Calcular $x_{n+1}$ como se indica en la fórmula.
4. Si $|f(x_{n+1})| < \text{tol}$ o $|x_{n+1} - x_n| < \text{tol}$, retornar $x_{n+1}$.
5. Actualizar $x_{n-1} = x_n$, $x_n = x_{n+1}$ y repetir.

## Método de la Regla Falsa

**Descripción**: El método de la Regla Falsa combina ideas de Bisección y Secante. Encuentra una raíz en un intervalo $[a, b]$ donde $f(a) \cdot f(b) < 0$, usando la intersección de la recta entre $(a, f(a))$ y $(b, f(b))$ con el eje $x$.

**Fórmula básica**:

```
c = b - f(b) * (b - a) / (f(b) - f(a))
```

- Si $f(a) \cdot f(c) < 0$, actualiza $b = c$; sino, $a = c$.

**Algoritmo**:
1. Definir intervalo $[a, b]$ donde $f(a) \cdot f(b) < 0$.
2. Calcular $c = b - f(b) * (b - a) / (f(b) - f(a))$.
3. Evaluar $f(c)$.
4. Si $|f(c)| < \text{tol}$ o $|b - a| < \text{tol}$, retornar $c$.
5. Si $f(a) \cdot f(c) < 0$, actualizar $b = c$; sino, $a = c$.
6. Repetir hasta convergencia.

## Método de Newton-Raphson

**Descripción**: El método de Newton-Raphson utiliza la derivada de la función para aproximar la raíz mediante la tangente en un punto inicial. Es rápido cerca de la raíz, pero requiere calcular $f'(x)$.

**Fórmula básica**:

```
x_{n+1} = x_n - f(x_n)/f'(x_n)
```

**Algoritmo**:
1. Elegir una aproximación inicial $x_0$.
2. Calcular $f(x_n)$ y $f'(x_n)$.
3. Calcular $x_{n+1} = x_n - f(x_n)/f'(x_n)$.
4. Si $|f(x_{n+1})| < \text{tol}$ o $|x_{n+1} - x_n| < \text{tol}$, retornar $x_{n+1}$.
5. Actualizar $x_n = x_{n+1}$ y repetir.

## Recursos Adicionales

- [Root-Finding Algorithms](https://en.wikipedia.org/wiki/Root-finding_algorithm) - Introducción a métodos para encontrar raíces.
- [Numerical Recipes](http://numerical.recipes/) - Libro con capítulos sobre métodos numéricos para ecuaciones no lineales.
- [MIT OpenCourseWare: Numerical Analysis](https://ocw.mit.edu/courses/mathematics/18-330-introduction-to-numerical-analysis-spring-2012/) - Curso con material sobre métodos para raíces.
