<template>
    <div id="book-manager-app">
    <header>
    </header>
    <nav></nav>
    <main>
        <router-view />
    </main>

    <footer>

    </footer>
    </div>
</template>

<style>
#book-manager-app {
    height:100vh;
    display: grid;
    grid-template-rows: 55px 35px 1fr 27px;
    grid-template-areas: "header"
                        "nav"
                        "main"
                        "footer";
    /* background-color: rgb(216, 206, 243); */
    
}

/* main {
    grid-area: main;
    position: fixed;
    inset: 0px;
    width: 12rem;
    height:40rem;
    max-width: 100vw;
    max-height: 100dvh;
    margin: auto;
} */
</style>