# Implementación de Test de Progresión de Estado

En el contexto de una fintech, necesitas implementar un sistema que maneje la progresión de estados de una solicitud de préstamo desde su recepción hasta su aprobación o rechazo. Los estados incluyen 'Recibido', 'En Revisión', 'Aprobado' y 'Rechazado'. El sistema debe asegurar la consistencia de estados y manejar correctamente los edge cases como solicitudes duplicadas o intentos de cambiar un estado finalizado.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Status Progression Test |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de Estados y Transiciones

**Objetivo:** Establecer los estados válidos y las transiciones permitidas entre ellos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar y definir los estados válidos de una solicitud de préstamo.
- Establecer las transiciones permitidas entre estos estados.

**Entregable:** Documento que describe los estados y transiciones permitidas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera edge cases como solicitudes duplicadas.
- Piensa en cómo manejar intentos de cambiar un estado finalizado.

</details>

### Fase 2: Implementación de Lógica de Estado

**Objetivo:** Implementar la lógica para manejar la progresión de estados.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar la lógica que permita la progresión de estados según las definiciones establecidas en la fase anterior.
- Asegurar la consistencia de estados y manejar edge cases.

**Entregable:** Implementación de la lógica de manejo de estados.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza un enfoque iterativo para probar y ajustar la lógica.
- Considera cómo validar la consistencia de estados en cada transición.

</details>

### Fase 3: Pruebas y Refactorización

**Objetivo:** Realizar pruebas exhaustivas y refactorizar el código si es necesario.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Realizar pruebas unitarias y de integración para validar la lógica de manejo de estados.
- Refactorizar el código para mejorar la legibilidad y mantenibilidad.

**Entregable:** Código refactorizado y pruebas unitarias/de integración.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza técnicas de prueba como TDD para garantizar la cobertura.
- Aplica principios de diseño limpio para la refactorización.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Cuáles son los estados válidos de una solicitud de préstamo y las transiciones permitidas entre ellos?
- **paraQueSirve**: ¿Por qué es importante definir y manejar correctamente los estados y transiciones de una solicitud de préstamo?
- **comoSeUsa**: ¿Cómo implementarías la lógica para manejar la progresión de estados de una solicitud de préstamo?
- **erroresComunes**: ¿Cuáles son los errores comunes que podrían ocurrir al manejar la progresión de estados y cómo los evitarías?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica la implementación de la lógica de manejo de estados y cómo las justificarías?

## Criterios de Evaluacion

- Definición clara de estados y transiciones permitidas.
- Implementación correcta de la lógica de manejo de estados.
- Pruebas unitarias y de integración que validan el comportamiento esperado.
- Código refactorizado según principios de diseño limpio.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
