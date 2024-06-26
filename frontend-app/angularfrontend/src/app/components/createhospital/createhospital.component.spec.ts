import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatehospitalComponent } from './createhospital.component';

describe('CreatehospitalComponent', () => {
  let component: CreatehospitalComponent;
  let fixture: ComponentFixture<CreatehospitalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreatehospitalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreatehospitalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
