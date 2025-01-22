function validateForm() {
    const fields = document.querySelectorAll('input, textarea');
    for (const field of fields) {
        if (!field.value.trim()) {
            alert('All fields must be filled out!');
            return false;
        }
    }
    return true;
}