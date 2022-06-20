const prompt = require("prompt-sync")();
const engine = require('./engine');

const hint = engine.generateHint();

var input = '';

do {
    input = prompt("What is your guess? ");
    console.log('You entered ' + input)
    if (input != 'exit' && !engine.isValid(input)) {
        console.error(`The input '${input}' doesn't match the format. It should be 4 unique digits`);
    } else if (engine.isValid()) {
        const result = engine.evaluate(hint, input);
        console.log(`Your result is ${result.bulls} bull(s) and ${result.cows} cow(s)`);
        if (result.bulls == 4) {
            console.log('You Won!!!');
            process.exit(0);
        }
    }
} while(input != 'exit')
