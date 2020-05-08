function Employee() {
    let _id, _name;

    this.setEmpId = function (id) {
        if (id > 0) {
            _id = id;
        }
    }

    this.setName = function (name) {
        if (typeof (name) == 'string' && name.length > 2) {
            _name = name;
        }
    }

    this.getDetails = function () {
        return 'id: ' + _id + ' name: ' + _name;
    }
}


let e1 = new Employee();
e1.setEmpId(101);
e1.setName('abc');
console.log(e1.getDetails(), e1);

let e2 = new Employee();
e2.setEmpId(103);
e2.setName('xyz');
console.log(e2.getDetails(), e2);