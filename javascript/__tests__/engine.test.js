const engine = require('../engine')

describe('Engine test', () => {
    it('should work', () => {
        expect( engine.isValid() ).toBe(true);
    });
});