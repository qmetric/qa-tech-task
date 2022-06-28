/**
 * Generates hint sequence. It should fit the following requirements:
 * 1) The sequence must contain only 4 characters
 * 2) Each character must be the number
 * 3) Each character must be unique
 * @return generated hint string
 */
function generateHint() {
    // TODO: Add implementation
    return "1234";
}

function isValid(guess) {
    // TODO: Add implementation
    return true;
}

function  evaluate(hint, guess) {
    // TODO: Add implementation
    return { bulls: 0, cows: 0 };
} 

module.exports = {
    generateHint, isValid, evaluate
}
