async function altaTragos() {
  const nombre = document.getElementById("nombre").value;
  const imagen = document.getElementById("imagen").value;
  const descripcion = document.getElementById("descripcion").value;
  const precio = document.getElementById("precio").value;
  const disponible = document.getElementById("disponible").checked;
  const cantidad = document.getElementById("cantidad").value;

  const jsonRequest = {
    nombre,
    imagen,
    descripcion,
    precio,
    disponible,
    cantidad,
  };

  const json = JSON.stringify(jsonRequest);

  await fetch(`http://localhost:8080/lacocinadejuan/CrearBebidasController`, {
    method: "POST",
    body: json,
    headers: new Headers({
      "Content-Type": "application/json",
    })   
  })
  .then(function (response) {
    if (response.ok) {
      alert("Alta de tragos correcta");
    }
    else{
      throw new Error('Server returned ' + response.status);
    }
  })
  .catch(function (error) {
    console.log("Hubo un problema con la petición Fetch:" + error);
  });
}
