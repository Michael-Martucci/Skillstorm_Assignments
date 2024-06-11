
export class employee {
    emp_id: string = '';
    name: string = '';
    DOB: string = '';
    role: string = '';
    hourly_rate: string = '';

    constructor(emp_id = '', name = '', DOB = '', role = '', hourly_rate = '') {
      this.emp_id = emp_id;
      this.name = name;
      this.DOB = DOB;
      this.role = role;
      this.hourly_rate = hourly_rate;
    }
}