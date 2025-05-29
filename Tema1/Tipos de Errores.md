
# Tipos de Errores en Cálculo Numérico

## Índice
- [Introducción](#introducción)
- [1. Error Absoluto](#1-error-absoluto)
- [2. Error Relativo](#2-error-relativo)
- [3. Error de Truncamiento](#3-error-de-truncamiento)
- [4. Error de Redondeo](#4-error-de-redondeo)
- [5. Error Numérico Total](#5-error-numérico-total)
- [6. Cancelación Numérica](#6-cancelación-numérica)

---

## Introducción

En el cálculo numérico, los errores son inevitables debido a la representación finita de los números y las aproximaciones necesarias para resolver problemas matemáticos en una computadora. Estos errores pueden clasificarse en distintos tipos, y entenderlos es crucial para analizar la precisión y estabilidad de los algoritmos numéricos.

---

## 1. Error Absoluto

**Descripción:**  
Es la diferencia entre el valor real (exacto) y el valor aproximado.

**Fórmula:**  
```math
Error absoluto = |valor real - valor aproximado|
```

**Pseudocódigo:**
```plaintext
Inicio
    Leer valor_real, valor_aproximado
    error_absoluto ← |valor_real - valor_aproximado|
    Mostrar error_absoluto
Fin
```

---

## 2. Error Relativo

**Descripción:**  
Es el cociente entre el error absoluto y el valor real.

**Fórmula:**  
```math
Error relativo = Error absoluto / |valor real|
```

**Pseudocódigo:**
```plaintext
Inicio
    Leer valor_real, valor_aproximado
    error_absoluto ← |valor_real - valor_aproximado|
    error_relativo ← error_absoluto / |valor_real|
    Mostrar error_relativo
Fin
```

---

## 3. Error de Truncamiento

**Descripción:**  
Se produce al aproximar una expresión matemática infinita por una versión finita.

**Ejemplo:** serie de Taylor truncada

**Pseudocódigo:**
```plaintext
Inicio
    Leer x, términos
    aproximación ← 0
    Para n desde 0 hasta términos - 1 hacer
        término ← (x^n) / factorial(n)
        aproximación ← aproximación + término
    Fin Para
    Mostrar "Aproximación:", aproximación
Fin
```

---

## 4. Error de Redondeo

**Descripción:**  
Ocurre por la representación finita de los números decimales.

**Pseudocódigo:**
```plaintext
Inicio
    Leer número
    número_redondeado ← redondear(número, decimales)
    error_redondeo ← |número - número_redondeado|
    Mostrar error_redondeo
Fin
```

---

## 5. Error Numérico Total

**Descripción:**  
Es la suma del error de truncamiento y redondeo.

**Pseudocódigo:**
```plaintext
Inicio
    Leer error_truncamiento, error_redondeo
    error_total ← error_truncamiento + error_redondeo
    Mostrar error_total
Fin
```

---

## 6. Cancelación Numérica

**Descripción:**  
Ocurre al restar dos números cercanos, provocando pérdida de precisión.

**Pseudocódigo:**
```plaintext
Inicio
    Leer a, b  // a y b son casi iguales
    resultado ← a - b
    Mostrar resultado
Fin
```

---

## Referencias
- Chapra, S. C., & Canale, R. P. (2010). *Métodos numéricos para ingenieros*.
- Burden, R. L., & Faires, J. D. (2011). *Análisis numérico*.
