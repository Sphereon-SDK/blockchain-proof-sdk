export * from './configuration.service';
import { ConfigurationService } from './configuration.service';
export * from './registration.service';
import { RegistrationService } from './registration.service';
export * from './verification.service';
import { VerificationService } from './verification.service';
export const APIS = [ConfigurationService, RegistrationService, VerificationService];
