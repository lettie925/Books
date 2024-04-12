<template>
    <div id="book-manager-app">
    <header>
        hello!
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
}

main {
    grid-area: main;
}
</style>