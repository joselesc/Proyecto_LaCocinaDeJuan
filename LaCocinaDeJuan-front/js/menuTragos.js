async function cargarVinos() {
    const loader = document.getElementById('loader');
    try {
        // Mostrar el loader
        loader.style.display = 'block';

        // URL de la API que proporciona los datos de los cócteles
        const url = 'http://localhost:8080/lacocinadejuan/ListarBebidasController';

        // Realizar la solicitud a la API
        const response = await fetch(url);

        // Verificar si la respuesta es exitosa
        if (!response.ok) {
            throw new Error('Error al cargar los cócteles');
        }

        // Parsear la respuesta como JSON
        const data = await response.json();

        // Obtener los primeros 20 cócteles
        //const vinos = data.drinks.slice(0, 20);

        // Generar el HTML para mostrar los cócteles
        const tragosHTML = data.map(trago => `
            <div class="card">
                <img src="${trago.imagen}" class="card-img-top" alt="${trago.nombre}">
                <div class="card-body">
                    <h5 class="card-title">${trago.nombre}</h5>
                    <p class="card-text">${trago.descripcion}</p>
                    <p class="card-text">Precio: ${trago.precio}</p>
                </div>
            </div>
        `).join('');

        // Mostrar los cócteles en el div "sucursales"
        document.querySelector('.tragos').innerHTML = tragosHTML;
    } catch (error) {
        console.error('Error:', error);
    } finally {
        // Ocultar el loader
        loader.style.display = 'none';
    }
}

cargarVinos();