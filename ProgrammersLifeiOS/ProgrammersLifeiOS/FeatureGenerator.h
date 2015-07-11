//
//  FeatureGenerator.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/10/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Repository.h"
#import "Player.h"

@interface FeatureGenerator : NSObject{
}

-(Feature*)generateHardFeature:(Player*)player :(Repository*)repository;
-(Feature*)generateMediumFeature:(Player*)player :(Repository*)repository;
-(Feature*)generateEasyFeature:(Player*)player :(Repository*)repository;
-(NSMutableArray*)generateBatchOfFeatures:(Player*)player :(Repository*)repository;

@end
