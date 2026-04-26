function toggleMode() {
    document.body.classList.toggle("dark-mode");
}

function handleClick(element) {
    const name = element.getAttribute("data-name");
    const desc = element.getAttribute("data-desc");

    alert("Course: " + name + "\n" + desc);
}

function showDetailFromElement(element) {
    const name = element.getAttribute("data-name");
    const desc = element.getAttribute("data-desc");

    document.getElementById("detailTitle").innerText = name;
    document.getElementById("detailDesc").innerText = desc;
    document.getElementById("detailBox").classList.remove("hidden");
}

function closeDetail() {
    document.getElementById("detailBox").classList.add("hidden");
}