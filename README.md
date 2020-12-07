# JUnit4 Taller

## Sistema bajo prueba

Una implementación de la estructura de datos pila (stack).

## Casos de prueba

Los casos de prueba están agrupadas por los métodos de la pila:

### `push`

- `push_shouldAddObject_whenGivenValidObject`
- `push_shouldAddManyObjects_whenGivenValidValues`
- `push_shouldThrowException_whenGivenNull`

### `pop`

- `pop_shouldRemoveObject_whenStackIsNotEmpty`  📌
- `pop_shouldReturnNull_whenStackIsEmpty`

### `peek`

- `peek_shouldReturnLastObject_whenStackIsNotEmpty`  📌
- `peek_shouldReturnNull_whenStackIsEmpty`  📌

### `size`

- `size_shouldBeZero_whenStackIsInstantiated`  📌
- `size_shouldIncrement_whenObjectIsPushed`
- `size_shouldDecrement_whenObjectIsPopped`
