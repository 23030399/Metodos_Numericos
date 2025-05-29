
# Tema 4 - Diferenciación e Integración Numérica

## Índice
- [Introducción](#introducción)
- [Cuadratura Gaussiana](#cuadratura-gaussiana)
- [Método del Trapecio](#método-del-trapecio)
- [Regla de Simpson](#regla-de-simpson)
- [Recursos Adicionales](#recursos-adicionales)

## Introducción

La diferenciación e integración numérica son técnicas esenciales en matemáticas aplicadas para aproximar derivadas e integrales de funciones cuando no es posible obtener soluciones analíticas exactas. Estas técnicas son ampliamente utilizadas en física, ingeniería y otras ciencias computacionales. La integración numérica, también conocida como cuadratura, busca aproximar el valor de una integral definida \( \int_a^b f(x) \, dx \). A continuación, se describen tres métodos comunes: Cuadratura Gaussiana, Método del Trapecio y Regla de Simpson.

## Cuadratura Gaussiana

La **Cuadratura Gaussiana** es un método de integración numérica que aproxima una integral definida seleccionando puntos específicos (nodos) y pesos óptimos para maximizar la precisión. Se basa en polinomios ortogonales, como los polinomios de Legendre, para determinar los nodos y pesos.

**Fórmula básica**:

$$
\int_a^b f(x) \, dx \approx \frac{b-a}{2} \sum_{i=1}^n w_i f\left( \frac{b-a}{2} x_i + \frac{a+b}{2} \right)
$$

- Donde \( x_i \) son los nodos de Legendre, \( w_i \) son los pesos asociados, y \( n \) es el número de nodos.

**Característica**: Este método es exacto para polinomios de grado hasta \( 2n-1 \).

## Método del Trapecio

El **Método del Trapecio** aproxima la integral de una función dividiendo el intervalo \([a, b]\) en subintervalos y aproximando el área bajo la curva en cada subintervalo por un trapecio.

**Fórmula básica**:

$$
\int_a^b f(x) \, dx \approx \frac{h}{2} \left[ f(a) + 2 \sum_{i=1}^{n-1} f(x_i) + f(b) \right]
$$

- Donde \( h = \frac{b-a}{n} \) y \( x_i = a + i h \).

**Característica**: Es simple pero menos preciso, con un error de orden \( O(h^2) \) para la regla compuesta.

## Regla de Simpson

La **Regla de Simpson** mejora la precisión del Método del Trapecio al aproximar la función en cada par de subintervalos mediante un polinomio de segundo grado (parábola) en lugar de una línea recta.

**Fórmula básica**:

$$
\int_a^b f(x) \, dx \approx \frac{h}{3} \left[ f(a) + 4 \sum_{i=1,3,\dots,n-1} f(x_i) + 2 \sum_{i=2,4,\dots,n-2} f(x_i) + f(b) \right]
$$

- Donde \( h = \frac{b-a}{n} \) y \( x_i = a + i h \).

**Característica**: Es más preciso que el Método del Trapecio, con un error de orden \( O(h^4) \) para la regla compuesta.

## Recursos Adicionales

- [Numerical Integration](https://en.wikipedia.org/wiki/Numerical_integration) - Introducción a métodos de integración numérica.
- [Numerical Recipes](http://numerical.recipes/) - Libro con capítulos sobre integración numérica.
- [MIT OpenCourseWare: Numerical Analysis](https://ocw.mit.edu/courses/mathematics/18-330-introduction-to-numerical-analysis-spring-2012/) - Curso con material sobre diferenciación e integración numérica.
