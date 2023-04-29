# Challenge ONE | Java | Back-end | Hotel Alura

<p align="center" >
     <img width="300" heigth="300" src="https://user-images.githubusercontent.com/91544872/189419040-c093db78-c970-4960-8aca-ffcc11f7ffaf.png">
</p>

---

## 🖥️ Tecnologías Utilizadas:

- Java
- Eclipse
- Biblioteca JCalendar
- MySql
- Plugin WindowBuilder </br>

---
## ⚠️ Importante! ⚠️

☕ Use Java versión 8 o superior para compatibilidad. </br></br>
📝 Recomendamos usar el editor de Eclipse para compatibilidad con la Interfaz Gráfica. </br></br>
🎨 La interfaz contiene dos métodos importantes:
- setResizable(false): determina el tamaño de la ventana, y a través del parámetro <strong>false</strong>, la pantalla no se puede maximizar;
- setLocationRelativeTo(null): determina la ubicación de la ventana, y a través del parámetro <strong>null</strong> la mantiene centrada en la pantalla.

---

## Conexion

### src/controller/Conexion.java:

1 - Se crea la conexion por medio de un ComboPooledDataSource.</br>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235278056-fdd57774-bb47-4c3d-9271-8fed33942366.png">
</p>

2 - Se crea un metodo para recuperar la conexion con un try-catch por posibles problemas de conexion.</br>

<p align="center" >
<img width="300" heigth="300" src="https://user-images.githubusercontent.com/121999643/235279353-fb962480-7fb5-4dbe-a2ee-ca9694e66f35.png">
</p>


# :hammer:Funcionalidades del proyecto

## Login
- Acceso a traves de usuario y contraseña

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235280770-dd94e9e8-4a92-445d-84e1-6d901273d23c.png">
</p>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235280785-5baad849-ad65-496d-88c7-436e17626195.png">
</p>

## Registro de Reservar

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235280888-bdb13597-f8d8-453c-84f2-cfefbee9b37b.png">
</p>

### Sistema de Reservas
- Seleccionamos la fecha de Entrada

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281004-ee241c7b-3060-4adb-9e4a-29a0c45793f3.png">
</p>

- Seleccionamos la fecha de Salida

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281019-993a7eb2-6fb0-4d54-a0cf-6e11bfd8f696.png">
</p>

- Se asigna el valor de la reserva en automatico

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281044-b0783a60-543c-4034-b3d6-efba5fe0b475.png">
</p>

- Seleccionamos el metodo de pago

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281049-f3396a45-96f3-4ee8-b672-29cd84b06754.png">
</p>

### Registro Huesped
- Llenamos los campos de Nombre:

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281111-5a4eceaf-e67e-44bb-8755-a8af549baeb2.png">
</p>

- Apellido

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281133-138e40d1-305d-4c7b-bde8-a4e18755934b.png">
</p>

- Seleccionamos la fecha de nacimiento

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281158-e1229eec-5042-45ca-a4d3-d154b8457ee0.png">
</p>

- Seleccionamos la Nacionalidad

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281191-c5d8cb77-ca97-4298-9b99-5f6325f72e2c.png">
</p>

-  Ingresamos un numero de telefono

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281213-153a9b81-72cf-4d17-8986-d0648de77f47.png">
</p>

## Busqueda

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281248-6fee365a-3e59-455f-999f-3fb962cd7b41.png">
</p>

### Sistema de busqueda

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281348-314d9a82-c1df-4f65-8f03-33105daaa2a7.png">
</p>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281478-fac0eda2-54c3-493f-9662-4396fac39f16.png">
</p>

- Buscar por ID de Reserva

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281372-fd0cb0bf-00de-4fd6-9cbc-af1cb0c22b44.png">
</p>

- Buscar por Apellido del Huesped

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281499-7cd10551-8157-445c-baa5-4bdc64287530.png">
</p>

- Modificar Reserva

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281538-b92fa4ee-41a1-4de5-956f-5cf32c83756c.png">
</p>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281562-71883e99-b2f0-46a8-9a47-b5403663d080.png">
</p>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281594-e294efb5-38ca-432d-8fc4-c9450c21c5e1.png">
</p>

- Modificar Huesped

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281631-58d6b980-58d1-4d4b-a1a5-91dc1a3ac132.png">
</p>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281650-ea0b31c7-6ff4-4b90-b693-bc633cf42cb9.png">
</p>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281676-a28221ec-effa-490e-9fd5-f9d83c233075.png">
</p>

- Eliminar Huesped

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235281971-0031bcea-77d3-4429-8fbc-5ba97b01c36f.png">
</p>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235282019-4f6ade58-0415-4a5c-85e3-6f6515274797.png">
</p>

- Eliminar Reserva
- Nota: No se puede eliminar una reserva si el huesped sigue registrado, elimine primero al huesped

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235282073-0d929045-08d6-4fe7-a50c-d12ce9796edb.png">
</p>

<p align="center" >
<img width="600" heigth="600" src="https://user-images.githubusercontent.com/121999643/235282087-c8634a45-29f1-4ec0-89a5-309a86830a07.png">
</p>


<p align="center" >
<img width="600" heigth="600" src="">
</p>
